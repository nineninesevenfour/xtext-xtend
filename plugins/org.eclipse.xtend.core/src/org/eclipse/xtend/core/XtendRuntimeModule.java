/*
 * generated by Xtext
 */
package org.eclipse.xtend.core;

import org.eclipse.xtend.core.compiler.UnicodeAwarePostProcessor;
import org.eclipse.xtend.core.compiler.XtendCompiler;
import org.eclipse.xtend.core.compiler.XtendGenerator;
import org.eclipse.xtend.core.compiler.XtendOutputConfigurationProvider;
import org.eclipse.xtend.core.conversion.IntUnderscoreValueConverter;
import org.eclipse.xtend.core.conversion.JavaIDValueConverter;
import org.eclipse.xtend.core.conversion.StringValueConverter;
import org.eclipse.xtend.core.conversion.XtendValueConverterService;
import org.eclipse.xtend.core.documentation.XtendDocumentationProvider;
import org.eclipse.xtend.core.formatting.XtendFormatter;
import org.eclipse.xtend.core.imports.XtendImportsConfiguration;
import org.eclipse.xtend.core.imports.XtendTypeUsageCollector;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer;
import org.eclipse.xtend.core.linking.Linker;
import org.eclipse.xtend.core.linking.LinkingProxyAwareResource;
import org.eclipse.xtend.core.linking.URIEncoder;
import org.eclipse.xtend.core.linking.XtendEObjectAtOffsetHelper;
import org.eclipse.xtend.core.linking.XtendLinkingDiagnosticMessageProvider;
import org.eclipse.xtend.core.naming.XtendQualifiedNameProvider;
import org.eclipse.xtend.core.parser.CustomXtendParser;
import org.eclipse.xtend.core.parser.FlexTokenRegionProvider;
import org.eclipse.xtend.core.parser.XtendNodeModelBuilder;
import org.eclipse.xtend.core.parser.XtendPartialParsingHelper;
import org.eclipse.xtend.core.parser.antlr.internal.DisabledAntlrLexer;
import org.eclipse.xtend.core.parser.antlr.internal.InternalXtendLexer;
import org.eclipse.xtend.core.resource.XtendLocationInFileProvider;
import org.eclipse.xtend.core.resource.XtendResourceDescriptionManager;
import org.eclipse.xtend.core.resource.XtendResourceDescriptionStrategy;
import org.eclipse.xtend.core.scoping.XtendImportedNamespaceScopeProvider;
import org.eclipse.xtend.core.serializer.XtendSerializerScopeProvider;
import org.eclipse.xtend.core.tasks.XtendTaskTagProvider;
import org.eclipse.xtend.core.typesystem.TypeDeclarationAwareBatchTypeResolver;
import org.eclipse.xtend.core.typesystem.XtendReentrantTypeResolver;
import org.eclipse.xtend.core.typesystem.XtendScopeProviderAccess;
import org.eclipse.xtend.core.typesystem.XtendTypeComputer;
import org.eclipse.xtend.core.typing.XtendExpressionHelper;
import org.eclipse.xtend.core.validation.XtendConfigurableIssueCodes;
import org.eclipse.xtend.core.validation.XtendEarlyExitValidator;
import org.eclipse.xtend.core.xtend.XtendFactory;
import org.eclipse.xtend.lib.macro.file.FileLocations;
import org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.impl.IDValueConverter;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.linking.lazy.LazyURIEncoder;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.antlr.IPartialParsingHelper;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerBindings;
import org.eclipse.xtext.parser.impl.TokenRegionProvider;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.EagerResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.tasks.ITaskTagProvider;
import org.eclipse.xtext.validation.CompositeEValidator;
import org.eclipse.xtext.validation.ConfigurableIssueCodesProvider;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.TraceAwarePostProcessor;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;
import org.eclipse.xtext.xbase.file.AbstractFileSystemSupport;
import org.eclipse.xtext.xbase.file.FileLocationsImpl;
import org.eclipse.xtext.xbase.file.JavaIOFileSystemSupport;
import org.eclipse.xtext.xbase.file.RuntimeWorkspaceConfigProvider;
import org.eclipse.xtext.xbase.file.WorkspaceConfig;
import org.eclipse.xtext.xbase.formatting.IBasicFormatter;
import org.eclipse.xtext.xbase.imports.IImportsConfiguration;
import org.eclipse.xtext.xbase.imports.TypeUsageCollector;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputer;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultReentrantTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.ScopeProviderAccess;
import org.eclipse.xtext.xbase.util.XExpressionHelper;
import org.eclipse.xtext.xbase.validation.EarlyExitValidator;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class XtendRuntimeModule extends org.eclipse.xtend.core.AbstractXtendRuntimeModule {

	public XbaseFactory bindXbaseFactory() {
		return XbaseFactory.eINSTANCE;
	}

	public Class<? extends XExpressionHelper> bindXExpressionHelper() {
		return XtendExpressionHelper.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return XtendValueConverterService.class;
	}

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
				.to(XtendImportedNamespaceScopeProvider.class);
	}

	@Override
	public void configureSerializerIScopeProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
			.annotatedWith(org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding.class)
			.to(XtendSerializerScopeProvider.class);
	}

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return XtendQualifiedNameProvider.class;
	}

	@Override
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return XtendResourceDescriptionStrategy.class;
	}

	public Class<? extends JvmModelAssociator> bindJvmModelAssociator() {
		return IXtendJvmAssociations.Impl.class;
	}

	public Class<? extends EarlyExitValidator> bindEarlyExitValidator() {
		return XtendEarlyExitValidator.class;
	}

	public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return XtendOutputConfigurationProvider.class;
	}

//	@Override
//	public Class<? extends IScopeProvider> bindIScopeProvider() {
//		return XtendScopeProvider.class;
//	}

	@Override
	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return XtendLocationInFileProvider.class;
	}

	@Override
	public Class<? extends ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
		return XtendLinkingDiagnosticMessageProvider.class;
	}

	public Class<? extends IBasicFormatter> bindIBasicFormatter() {
		return XtendFormatter.class;
	}

	public Class<? extends IImportsConfiguration> bindIImportsConfiguration() {
		return XtendImportsConfiguration.class;
	}
	
	public Class<? extends TypeUsageCollector> bindTypeUsageCollector() {
		return XtendTypeUsageCollector.class;
	}

	@Override
	public Class<? extends ConfigurableIssueCodesProvider> bindConfigurableIssueCodesProvider() {
		return XtendConfigurableIssueCodes.class;
	}

	public XtendFactory bindXtendFactory() {
		return XtendFactory.eINSTANCE;
	}

	@Override
	public Class<? extends DefaultBatchTypeResolver> bindDefaultBatchTypeResolver() {
		return TypeDeclarationAwareBatchTypeResolver.class;
	}

	@Override
	public Class<? extends DefaultReentrantTypeResolver> bindDefaultReentrantTypeResolver() {
		return XtendReentrantTypeResolver.class;
	}
	
	public Class<? extends ScopeProviderAccess> bindScoperProviderAccess() {
		return XtendScopeProviderAccess.class;
	}

	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return XtendCompiler.class;
	}

	public Class<? extends TraceAwarePostProcessor> bindTraceAwarePostProcessor() {
		return UnicodeAwarePostProcessor.class;
	}

	@Override
	public Class<? extends ITypeComputer> bindITypeComputer() {
		return XtendTypeComputer.class;
	}

	public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
		return XtendJvmModelInferrer.class;
	}

	@Override
	public Class<? extends Manager> bindIResourceDescription$Manager() {
		return XtendResourceDescriptionManager.class;
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(boolean.class).annotatedWith(Names.named(CompositeEValidator.USE_EOBJECT_VALIDATOR))
				.toInstance(false);
	}

	@Override
	public Class<? extends IResourceValidator> bindIResourceValidator() {
		return org.eclipse.xtend.core.validation.CachingResourceValidatorImpl.class;
	}

	@Override
	public Class<? extends ILinker> bindILinker() {
		return Linker.class;
	}

	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return LinkingProxyAwareResource.class;
	}

	public Class<? extends LazyURIEncoder> bindLazyURIEncoder() {
		return URIEncoder.class;
	}

	/**
	 * @since 2.4.2
	 */
	@Override
	public void configureIResourceDescriptions(com.google.inject.Binder binder) {
		binder.bind(IResourceDescriptions.class).to(EagerResourceSetBasedResourceDescriptions.class);
	}

	public Class<? extends MutableFileSystemSupport> bindFileHandleFactory() {
		return AbstractFileSystemSupport.class;
	}

	public Class<? extends AbstractFileSystemSupport> bindAbstractFileSystemSupport() {
		return JavaIOFileSystemSupport.class;
	}

	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return XtendGenerator.class;
	}

	public void configureWorkspaceConfigContribution(Binder binder) {
		binder.bind(WorkspaceConfig.class).toProvider(RuntimeWorkspaceConfigProvider.class);
	}

	public Class<? extends FileLocations> bindFileLocations() {
		return FileLocationsImpl.class;
	}

	public Class<? extends IDValueConverter> bindIDValueConverter() {
		return JavaIDValueConverter.class;
	}

	public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
		return XtendDocumentationProvider.class;
	}

	@Override
	public Class<? extends IParser> bindIParser() {
		return CustomXtendParser.class;
	}

	@Override
	public Class<? extends Lexer> bindLexer() {
		return DisabledAntlrLexer.class;
	}

	@Override
	public Provider<InternalXtendLexer> provideInternalXtendLexer() {
		return new Provider<InternalXtendLexer>() {
			public InternalXtendLexer get() {
				return new DisabledAntlrLexer(null);
			}
		};
	}

	@Override
	public void configureRuntimeLexer(Binder binder) {
		binder.bind(Lexer.class)
				.annotatedWith(Names.named(LexerBindings.RUNTIME))
				.to(DisabledAntlrLexer.class);
		binder.bind(DisabledAntlrLexer.class).toProvider(new Provider<DisabledAntlrLexer>() {
			public DisabledAntlrLexer get() {
				return new DisabledAntlrLexer(null);
			}
		});
	}
	
	public Class<? extends XbaseValueConverterService.IntUnderscoreValueConverter> bindIntUnderscoreValueConverter() {
		return IntUnderscoreValueConverter.class;
	}
	
	public Class<? extends STRINGValueConverter> bindSTRINGValueConverter() {
		return StringValueConverter.class;
	}
	
	public Class<? extends TokenRegionProvider> bindTokenRegionProvider() {
		return FlexTokenRegionProvider.class;
	}
	
	@Override
	public Class<? extends IPartialParsingHelper> bindIPartialParserHelper() {
		return XtendPartialParsingHelper.class;
	}
	
	public Class<? extends NodeModelBuilder> bindNodeModelBuilder() {
		return XtendNodeModelBuilder.class;
	}
	
	public Class<? extends ITaskTagProvider> bindTaskTagProvider() {
		return XtendTaskTagProvider.class;
	}
	
	@Override
	public Class<? extends EObjectAtOffsetHelper> bindEObjectAtOffsetHelper() {
		return XtendEObjectAtOffsetHelper.class;
	}
}
